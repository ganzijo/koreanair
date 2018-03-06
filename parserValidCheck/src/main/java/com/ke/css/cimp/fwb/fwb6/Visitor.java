package com.ke.css.cimp.fwb.fwb6;
/* -----------------------------------------------------------------------------
 * Visitor.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Tue Mar 06 10:37:30 KST 2018
 *
 * -----------------------------------------------------------------------------
 */

public interface Visitor
{
  public Object visit(Rule_MESSAGE rule);
  public Object visit(Rule_FWB rule);
  public Object visit(Rule_HEADER rule);
  public Object visit(Rule_SMI rule);
  public Object visit(Rule_AWB rule);
  public Object visit(Rule_AWB_NUMBER rule);
  public Object visit(Rule_FLT rule);
  public Object visit(Rule_FLIGHT_BOOKINGS rule);
  public Object visit(Rule_RTG rule);
  public Object visit(Rule_ROUTING rule);
  public Object visit(Rule_Grp_Onward_Destination_Carrier rule);
  public Object visit(Rule_SHP rule);
  public Object visit(Rule_Grp_Account_Detail_SHP rule);
  public Object visit(Rule_Grp_Name_SHP rule);
  public Object visit(Rule_Grp_Street_Address_SHP rule);
  public Object visit(Rule_Grp_Location_SHP rule);
  public Object visit(Rule_Grp_Coded_Location_SHP rule);
  public Object visit(Rule_SHIPPER_CONTACT rule);
  public Object visit(Rule_CNE rule);
  public Object visit(Rule_Grp_Account_Detail_CNE rule);
  public Object visit(Rule_Grp_Name_CNE rule);
  public Object visit(Rule_Grp_Street_Address_CNE rule);
  public Object visit(Rule_Grp_Location_CNE rule);
  public Object visit(Rule_Grp_Coded_Location_CNE rule);
  public Object visit(Rule_CONSIGNEE_CONTACT rule);
  public Object visit(Rule_AGT rule);
  public Object visit(Rule_Grp_AGT_AccountDetail rule);
  public Object visit(Rule_IATA_CARGO_AGENT_CODE rule);
  public Object visit(Rule_SSR rule);
  public Object visit(Rule_Grp_SPECIAL_SERVICE_REQUEST rule);
  public Object visit(Rule_NFY rule);
  public Object visit(Rule_Grp_Name_NFY rule);
  public Object visit(Rule_Grp_Street_Address_NFY rule);
  public Object visit(Rule_Grp_Location_NFY rule);
  public Object visit(Rule_Grp_Coded_Location_NFY rule);
  public Object visit(Rule_NOTIFY_CONTACT rule);
  public Object visit(Rule_ACC rule);
  public Object visit(Rule_ACCS rule);
  public Object visit(Rule_CVD rule);
  public Object visit(Rule_Grp_Prepaid_Collect_Charge_Declarations rule);
  public Object visit(Rule_RTD rule);
  public Object visit(Rule_RTDS rule);
  public Object visit(Rule_Grp_First rule);
  public Object visit(Rule_Grp_Second rule);
  public Object visit(Rule_Grp_Number_of_Pieces_RCP_Details rule);
  public Object visit(Rule_Grp_Gross_Weight_Details rule);
  public Object visit(Rule_Grp_Rate_Class_Details rule);
  public Object visit(Rule_Grp_COMMODITY_ITEM_NUMBER rule);
  public Object visit(Rule_Grp_Chargeable_Weight_Details rule);
  public Object visit(Rule_Grp_Rate_Charge_Details rule);
  public Object visit(Rule_Grp_Total_Details rule);
  public Object visit(Rule_Grp_Goods_Description rule);
  public Object visit(Rule_Grp_Consolidation rule);
  public Object visit(Rule_Grp_Dimensions rule);
  public Object visit(Rule_Grp_Volume rule);
  public Object visit(Rule_Grp_ULD_Number rule);
  public Object visit(Rule_Grp_Shippers_Load_and_Count rule);
  public Object visit(Rule_Grp_Harmonised_Commodity_Code rule);
  public Object visit(Rule_Grp_Country_of_Origin_of_Goods rule);
  public Object visit(Rule_Grp_Service_Code_Details rule);
  public Object visit(Rule_OTH rule);
  public Object visit(Rule_OTHS rule);
  public Object visit(Rule_OTHER_CHARGES rule);
  public Object visit(Rule_OTHER_CHARGE_CODE rule);
  public Object visit(Rule_CSD rule);
  public Object visit(Rule_Grp_Total_Weight_Charge rule);
  public Object visit(Rule_Grp_Valuation_Charge rule);
  public Object visit(Rule_Grp_Taxes rule);
  public Object visit(Rule_Grp_Total_Other_Charges_Due_Agent rule);
  public Object visit(Rule_Grp_Total_Other_Charges_Due_Carrier rule);
  public Object visit(Rule_Grp_Charge_Summary_Total rule);
  public Object visit(Rule_CER rule);
  public Object visit(Rule_ISU rule);
  public Object visit(Rule_ISSUE_DATE rule);
  public Object visit(Rule_Grp_Authorisation rule);
  public Object visit(Rule_OSI rule);
  public Object visit(Rule_Grp_Other_Service_Information rule);
  public Object visit(Rule_CDC rule);
  public Object visit(Rule_REF rule);
  public Object visit(Rule_Grp_Sender_Office_Message_Address rule);
  public Object visit(Rule_Grp_Sender_Office_File_Reference rule);
  public Object visit(Rule_Grp_Sender_Participant_Identification rule);
  public Object visit(Rule_COR rule);
  public Object visit(Rule_STANDARD_MESSAGE_IDENTIFIER rule);
  public Object visit(Rule_MId_FLT rule);
  public Object visit(Rule_MId_RTG rule);
  public Object visit(Rule_MId_SHP rule);
  public Object visit(Rule_MId_CNE rule);
  public Object visit(Rule_MId_AGT rule);
  public Object visit(Rule_MId_SSR rule);
  public Object visit(Rule_MId_NFY rule);
  public Object visit(Rule_MId_ACC rule);
  public Object visit(Rule_MId_CVD rule);
  public Object visit(Rule_MId_RTD rule);
  public Object visit(Rule_MId_OTH rule);
  public Object visit(Rule_PPD_COL_COND rule);
  public Object visit(Rule_MId_CER rule);
  public Object visit(Rule_MId_ISU rule);
  public Object visit(Rule_MId_OSI rule);
  public Object visit(Rule_MId_CDC rule);
  public Object visit(Rule_MId_REF rule);
  public Object visit(Rule_MId_COR rule);
  public Object visit(Rule_IF_HUB_REFERENCE_KEY rule);
  public Object visit(Rule_MESSAGE_TYPE rule);
  public Object visit(Rule_MESSAGE_SUBTYPE rule);
  public Object visit(Rule_MESSAGE_RECEIVER rule);
  public Object visit(Rule_MESSAGE_SENDER rule);
  public Object visit(Rule_MESSAGE_TYPE_VERSION_NUMBER rule);
  public Object visit(Rule_Sub_AWB_Prefix rule);
  public Object visit(Rule_Sub_AWB_SerialNum rule);
  public Object visit(Rule_AIRPORT_CITY_CODE_OF_ORIGIN rule);
  public Object visit(Rule_AIRPORT_CITY_CODE_OF_DEST rule);
  public Object visit(Rule_Hid_AWB_ShipCode rule);
  public Object visit(Rule_NUMBER_OF_PIECES rule);
  public Object visit(Rule_WEIGHT_CODE rule);
  public Object visit(Rule_WEIGHT rule);
  public Object visit(Rule_VOLUME_CODE rule);
  public Object visit(Rule_VOLUME_AMOUNT rule);
  public Object visit(Rule_Sub_Carrier_Code rule);
  public Object visit(Rule_Sub_Flight_Number rule);
  public Object visit(Rule_Sub_Day rule);
  public Object visit(Rule_Sub_Airport_City_Code rule);
  public Object visit(Rule_SHIPPER_ACCOUNT_NUMBER rule);
  public Object visit(Rule_SHIPPER_NAME rule);
  public Object visit(Rule_SHIPPER_STREET_ADDRESS rule);
  public Object visit(Rule_SHIPPER_PLACE rule);
  public Object visit(Rule_SHIPPER_STATE_PROVINCE rule);
  public Object visit(Rule_SHIPPER_ISO_COUNTRY_CODE rule);
  public Object visit(Rule_SHIPPER_POST_CODE rule);
  public Object visit(Rule_SHIPPER_CONTACT_IDENTIFIER rule);
  public Object visit(Rule_SHIPPER_CONTACT_NUMBER rule);
  public Object visit(Rule_CONSIGNEE_ACCOUNT_NUMBER rule);
  public Object visit(Rule_CONSIGNEE_NAME rule);
  public Object visit(Rule_CONSIGNEE_STREET_ADDRESS rule);
  public Object visit(Rule_CONSIGNEE_PLACE rule);
  public Object visit(Rule_CONSIGNEE_STATE_PROVINCE rule);
  public Object visit(Rule_CONSIGNEE_ISO_COUNTRY_CODE rule);
  public Object visit(Rule_CONSIGNEE_POST_CODE rule);
  public Object visit(Rule_CONSIGNEE_CONTACT_IDENTIFIER rule);
  public Object visit(Rule_CONSIGNEE_CONTACT_NUMBER rule);
  public Object visit(Rule_AGENT_ACCOUNT_NUMBER rule);
  public Object visit(Rule_Sub_IATA_CARGO_AGENT_CODE rule);
  public Object visit(Rule_Sub_IATA_Cargo_Agent_CASS_Address rule);
  public Object visit(Rule_AGENT_PARTICIPANT_IDENTIFIER rule);
  public Object visit(Rule_AGENT_NAME rule);
  public Object visit(Rule_AGENT_PLACE rule);
  public Object visit(Rule_SPECIAL_SERVICE_REQUEST rule);
  public Object visit(Rule_NOTIFY_NAME rule);
  public Object visit(Rule_NOTIFY_STREET_ADDRESS rule);
  public Object visit(Rule_NOTIFY_PLACE rule);
  public Object visit(Rule_NOTIFY_STATE_PROVINCE rule);
  public Object visit(Rule_NOTIFY_ISO_COUNTRY_CODE rule);
  public Object visit(Rule_NOTIFY_POST_CODE rule);
  public Object visit(Rule_NOTIFY_CONTACT_IDENTIFIER rule);
  public Object visit(Rule_NOTIFY_CONTACT_NUMBER rule);
  public Object visit(Rule_ACCOUNTING_INFORMATION_ID rule);
  public Object visit(Rule_ACCOUNTING_INFORMATION rule);
  public Object visit(Rule_ISO_CURRENCY_CODE rule);
  public Object visit(Rule_CHARGE_CODE rule);
  public Object visit(Rule_P_C_IND_WEIGHT_VALUATION rule);
  public Object visit(Rule_P_C_IND_OTHER_CHARGES rule);
  public Object visit(Rule_DECLARED_VALUE_FOR_CARRIAGE rule);
  public Object visit(Rule_DECLARED_VALUE_FOR_CUSTOMS rule);
  public Object visit(Rule_AMOUNT_OF_INSURANCE rule);
  public Object visit(Rule_Hid_AWB_Rate_Line_Number rule);
  public Object visit(Rule_Hid_AWB_Rate_Line_Number_12 rule);
  public Object visit(Rule_Hid_AWB_Column_Identifier_P rule);
  public Object visit(Rule_Hid_AWB_Column_Identifier_C rule);
  public Object visit(Rule_Hid_AWB_Column_Identifier_S rule);
  public Object visit(Rule_Hid_AWB_Column_Identifier_W rule);
  public Object visit(Rule_Hid_AWB_Column_Identifier_R rule);
  public Object visit(Rule_Hid_AWB_Column_Identifier_T rule);
  public Object visit(Rule_Hid_AWB_Column_Identifier_N rule);
  public Object visit(Rule_Hid_Goods_data_Identifier_G rule);
  public Object visit(Rule_Hid_Goods_data_Identifier_C rule);
  public Object visit(Rule_Hid_Goods_data_Identifier_D rule);
  public Object visit(Rule_Hid_Goods_data_Identifier_V rule);
  public Object visit(Rule_Hid_Goods_data_Identifier_U rule);
  public Object visit(Rule_Hid_Goods_data_Identifier_S rule);
  public Object visit(Rule_Hid_Goods_data_Identifier_H rule);
  public Object visit(Rule_Hid_Goods_data_Identifier_O rule);
  public Object visit(Rule_GROSS_WEIGHT rule);
  public Object visit(Rule_RATE_CLASS_CODE rule);
  public Object visit(Rule_COMMODITY_ITEM_NUMBER rule);
  public Object visit(Rule_CHARGEABLE_WEIGHT rule);
  public Object visit(Rule_RATE_CHARGE rule);
  public Object visit(Rule_CHARGE_AMOUNT rule);
  public Object visit(Rule_NATURE_AND_QUANTITY_OF_GOODS rule);
  public Object visit(Rule_NATURE_AND_QUANTITY_CONSOL rule);
  public Object visit(Rule_VOLUME_WEIGHT_CODE rule);
  public Object visit(Rule_VOLUME_WEIGHT rule);
  public Object visit(Rule_MEASUREMENT_UNIT_CODE rule);
  public Object visit(Rule_LENGTH_DIMENSION rule);
  public Object visit(Rule_WIDTH_DIMENSION rule);
  public Object visit(Rule_HEIGHT_DIMENSION rule);
  public Object visit(Rule_VOLUME_NUMBERS_OF_PIECES rule);
  public Object visit(Rule_ULD_TYPE rule);
  public Object visit(Rule_ULD_SERIAL_NUMBER rule);
  public Object visit(Rule_ULD_OWNER_CODE rule);
  public Object visit(Rule_SLAC rule);
  public Object visit(Rule_HARMONISED_COMMODITY_CODE rule);
  public Object visit(Rule_ISO_COUNTRY_CODE rule);
  public Object visit(Rule_SERVICE_CODE rule);
  public Object visit(Rule_Sub_Other_Charge_Code rule);
  public Object visit(Rule_Sub_Entitlement_Code rule);
  public Object visit(Rule_Hid_Change_Identifier_WT rule);
  public Object visit(Rule_Hid_Change_Identifier_VC rule);
  public Object visit(Rule_Hid_Change_Identifier_TX rule);
  public Object visit(Rule_Hid_Change_Identifier_OA rule);
  public Object visit(Rule_Hid_Change_Identifier_OC rule);
  public Object visit(Rule_Hid_Change_Identifier_CT rule);
  public Object visit(Rule_WT_CHARGE_AMOUNT rule);
  public Object visit(Rule_VC_CHARGE_AMOUNT rule);
  public Object visit(Rule_TX_CHARGE_AMOUNT rule);
  public Object visit(Rule_OA_CHARGE_AMOUNT rule);
  public Object visit(Rule_OC_CHARGE_AMOUNT rule);
  public Object visit(Rule_CT_CHARGE_AMOUNT rule);
  public Object visit(Rule_SIGNATURE rule);
  public Object visit(Rule_Sub_Month rule);
  public Object visit(Rule_Sub_Year rule);
  public Object visit(Rule_ISSUE_PLACE rule);
  public Object visit(Rule_ISSUE_SIGNATURE rule);
  public Object visit(Rule_OTHER_SERVICE_INFORMATION rule);
  public Object visit(Rule_DESTINATION_ISO_CURRENCY_CODE rule);
  public Object visit(Rule_RATE_OF_EXCHANGE_IN_DEST_CURR rule);
  public Object visit(Rule_CHARGE_AMOUNT_IN_DEST_CURR rule);
  public Object visit(Rule_CHARGE_AMOUNT_AT_DEST rule);
  public Object visit(Rule_TOTAL_COLLECT_CHARGE_AMOUNT rule);
  public Object visit(Rule_SENDER_AIRPORT_CITY_CODE rule);
  public Object visit(Rule_SENDER_OFFICE_FUNC_DESIGNATOR rule);
  public Object visit(Rule_SENDER_COMPANY_DESIGNATOR rule);
  public Object visit(Rule_SENDER_FILE_REFERENCE rule);
  public Object visit(Rule_SENDER_PARTICIPANT_IDENTIFIER rule);
  public Object visit(Rule_SENDER_PARTICIPANT_CODE rule);
  public Object visit(Rule_SENDER_PART_AIRPORT_CITY_CODE rule);
  public Object visit(Rule_CUSTOMS_ORIGIN_CODE rule);
  public Object visit(Rule_Sep_CRLF rule);
  public Object visit(Rule_CR rule);
  public Object visit(Rule_LF rule);
  public Object visit(Rule_Sep_Slant rule);
  public Object visit(Rule_Sep_Bar rule);
  public Object visit(Rule_Typ_Alpha rule);
  public Object visit(Rule_Typ_Numeric rule);
  public Object visit(Rule_Typ_Decimal rule);
  public Object visit(Rule_Typ_Mixed rule);
  public Object visit(Rule_Typ_Text rule);

  public Object visit(Terminal_StringValue value);
  public Object visit(Terminal_NumericValue value);
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */