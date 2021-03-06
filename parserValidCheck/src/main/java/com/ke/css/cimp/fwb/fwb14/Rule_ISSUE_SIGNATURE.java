package com.ke.css.cimp.fwb.fwb14;
/* -----------------------------------------------------------------------------
 * Rule_ISSUE_SIGNATURE.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Tue Mar 06 10:34:51 KST 2018
 *
 * -----------------------------------------------------------------------------
 */

import java.util.ArrayList;

final public class Rule_ISSUE_SIGNATURE extends Rule
{
  public Rule_ISSUE_SIGNATURE(String spelling, ArrayList<Rule> rules)
  {
    super(spelling, rules);
  }

  public Object accept(Visitor visitor)
  {
    return visitor.visit(this);
  }

  public static Rule_ISSUE_SIGNATURE parse(ParserContext context)
  {
    context.push("ISSUE_SIGNATURE");

    boolean parsed = true;
    int s0 = context.index;
    ParserAlternative a0 = new ParserAlternative(s0);

    ArrayList<ParserAlternative> as1 = new ArrayList<ParserAlternative>();
    parsed = false;
    {
      int s1 = context.index;
      ParserAlternative a1 = new ParserAlternative(s1);
      parsed = true;
      if (parsed)
      {
        boolean f1 = true;
        @SuppressWarnings("unused")
        int c1 = 0;
        for (int i1 = 0; i1 < 20 && f1; i1++)
        {
          Rule rule = Rule_Typ_Text.parse(context);
          if ((f1 = rule != null))
          {
            a1.add(rule, context.index);
            c1++;
          }
        }
        parsed = true;
      }
      if (parsed)
      {
        as1.add(a1);
      }
      context.index = s1;
    }

    ParserAlternative b = ParserAlternative.getBest(as1);

    parsed = b != null;

    if (parsed)
    {
      a0.add(b.rules, b.end);
      context.index = b.end;
    }

    Rule rule = null;
    if (parsed)
    {
        rule = new Rule_ISSUE_SIGNATURE(context.text.substring(a0.start, a0.end), a0.rules);
    }
    else
    {
        context.index = s0;
    }

    context.pop("ISSUE_SIGNATURE", parsed);

    return (Rule_ISSUE_SIGNATURE)rule;
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
