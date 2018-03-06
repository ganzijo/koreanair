package parserValidCheck;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XML11Serializer;

public class XmlWordWrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xml = "<MESSAGE>\r\n" + 
				"<HEADER>\r\n" + 
				"<IF_HUB_REFERENCE_KEY>12345123451234512345123451234512345</IF_HUB_REFERENCE_KEY>\r\n" + 
				"<MESSAGE_TYPE>CIMP</MESSAGE_TYPE>\r\n" + 
				"<MESSAGE_SUBTYPE>FBL</MESSAGE_SUBTYPE>\r\n" + 
				"<MESSAGE_RECEIVER>QD SELFMKE</MESSAGE_RECEIVER>\r\n" + 
				"<MESSAGE_SENDER>SELFSCI</MESSAGE_SENDER></HEADER>\r\n" + 
				"<FBL>\r\n" + 
				"<SMI>\r\n" + 
				"<STANDARD_MESSAGE_IDENTIFIER>FBL</STANDARD_MESSAGE_IDENTIFIER>\r\n" + 
				"<MESSAGE_TYPE_VERSION_NUMBER>3</MESSAGE_TYPE_VERSION_NUMBER></SMI>\r\n" + 
				"<ORG>\r\n" + 
				"<MESSAGE_SEQUENCE_NUMBER>1</MESSAGE_SEQUENCE_NUMBER>\r\n" + 
				"<FLIGHT_NUMBER>CI0161</FLIGHT_NUMBER>\r\n" + 
				"<FLIGHT_DATE>02FEB</FLIGHT_DATE>\r\n" + 
				"<AIRPORT_CODE_OF_LOADING>ICN</AIRPORT_CODE_OF_LOADING>\r\n" + 
				"<DST>\r\n" + 
				"<AIRPORT_CODE_OF_UNLOADING>TPE</AIRPORT_CODE_OF_UNLOADING>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771424360</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>HAN</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>37</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>555</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>3.33</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>ELECT-SAC</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771425841</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>1</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>45</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>0.27</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>SPARE PART</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771562831</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>10</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>200</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>1.20</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>ELECT-TAL</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772113602</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>150</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>3000</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>9</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>GARMENT-RAS</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772116892</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>6</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>350</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>2.10</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>LECT-JOE</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771563343</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>8</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>300</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>1.80</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>ELECT</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772113753</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>3</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>1200</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>7.20</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>STRAWBERRY-GOO</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772114523</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>12</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>280</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>1.68</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>LENS-GBT</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772117323</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>XMN</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>1</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>350</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>2.10</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>TRANSFORMER-EIK</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772118023</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>DFW</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>6</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>800</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>4.80</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>VALVE-CEV</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772118723</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>30</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>300</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>1.80</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>AUTO PART</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771426154</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>50</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>300</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>1.80</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>ELECT-KWE</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772112854</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>JFK</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>4</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>824</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>4.94</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>PUMP-DSC</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772113554</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>2</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>800</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>4.80</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>STRAWBERRY-GOO</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771561895</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>4</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>3230</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>19.38</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>MACHINE-CAC</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771564835</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>13</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>50</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>0.30</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>ELECT</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771565395</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>20</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>200</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>1.20</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>ELECT</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772113985</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>13</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>1700</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>10.20</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>ELECT-SIS</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772114615</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>1</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>10</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>0.06</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>DIP</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771268466</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>14</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>200</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>1.20</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>IC</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29771564076</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>TPE</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>5</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>200</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>1.20</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>ELECT</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772113856</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>ORD</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>15</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>200</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>1.19</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>SHIRTS-ESS</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB>\r\n" + 
				"<AWB>\r\n" + 
				"<AWB_NUMBER>29772114346</AWB_NUMBER>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_ORIGIN>ICN</AIRPORT_CITY_CODE_OF_ORIGIN>\r\n" + 
				"<AIRPORT_CITY_CODE_OF_DEST>ORD</AIRPORT_CITY_CODE_OF_DEST>\r\n" + 
				"<SHIPMENT_DESCRIPTION_CODE>T</SHIPMENT_DESCRIPTION_CODE>\r\n" + 
				"<NUMBER_OF_PIECES>1</NUMBER_OF_PIECES>\r\n" + 
				"<WEIGHT_CODE>K</WEIGHT_CODE>\r\n" + 
				"<WEIGHT>497</WEIGHT>\r\n" + 
				"<VOLUME_CODE>MC</VOLUME_CODE>\r\n" + 
				"<VOLUME_AMOUNT>2.98</VOLUME_AMOUNT>\r\n" + 
				"<MANIFEST_DESC_OF_GOODS>ELECT-ESS</MANIFEST_DESC_OF_GOODS>\r\n" + 
				"<SPECIAL_HANDLING_CODE>SPX</SPECIAL_HANDLING_CODE></AWB></DST></ORG>\r\n" + 
				"<LCI>\r\n" + 
				"<END_OF_MESSAGE_CODE>LAST</END_OF_MESSAGE_CODE></LCI></FBL></MESSAGE>";
		String formattedString = null;
	     try {
	         final InputSource src = new InputSource(new StringReader(xml));
	         final Node document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src).getDocumentElement();

	         // the last parameter sets indenting/pretty-printing to true:
	         OutputFormat outputFormat = new OutputFormat("WHATEVER", "UTF-8", true);
	         // line width = 0 means no line wrapping:
	         outputFormat.setLineWidth(0);
	         StringWriter sw = new StringWriter();
	         XML11Serializer writer = new XML11Serializer(sw, outputFormat);
	         writer.serialize((Element)document);
	         formattedString = sw.toString(); 
	         System.out.println(formattedString);

	     } catch (Exception e) {
	         throw new RuntimeException(e);
	     }
	}

}