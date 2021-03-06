/**
Copyright 2017 Frontier Science & Technology Research Foundation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

ADDITIONAL DISCLAIMER:
In addition to the standard warranty exclusions and limitations of 
liability set forth in sections 7, 8 and 9 of the Apache 2.0 license 
that governs the use and development of this software, Frontier Science 
& Technology Research Foundation disclaims any liability for use of 
this software for patient care or in clinical settings. This software 
was developed solely for use in medical and public health research, and 
was not intended, designed, or validated to guide patient care.
*/ 



/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.fstrf.stanfordAsiInterpreter.resistance.grammar.analysis;

import java.util.*;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable in;
    private Hashtable out;

    public Object getIn(Node node)
    {
        if(in == null)
        {
            return null;
        }

        return in.get(node);
    }

    public void setIn(Node node, Object in)
    {
        if(this.in == null)
        {
            this.in = new Hashtable(1);
        }

        if(in != null)
        {
            this.in.put(node, in);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(out == null)
        {
            return null;
        }

        return out.get(node);
    }

    public void setOut(Node node, Object out)
    {
        if(this.out == null)
        {
            this.out = new Hashtable(1);
        }

        if(out != null)
        {
            this.out.put(node, out);
        }
        else
        {
            this.out.remove(node);
        }
    }
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseALogicstatementStatement(ALogicstatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAScoreStatement(AScoreStatement node)
    {
        defaultCase(node);
    }

    public void caseABooleancondition(ABooleancondition node)
    {
        defaultCase(node);
    }

    public void caseAStatementCondition(AStatementCondition node)
    {
        defaultCase(node);
    }

    public void caseAResidueCondition(AResidueCondition node)
    {
        defaultCase(node);
    }

    public void caseAExcludeCondition(AExcludeCondition node)
    {
        defaultCase(node);
    }

    public void caseASelectCondition(ASelectCondition node)
    {
        defaultCase(node);
    }

    public void caseACondition2(ACondition2 node)
    {
        defaultCase(node);
    }

    public void caseAAndLogicsymbol(AAndLogicsymbol node)
    {
        defaultCase(node);
    }

    public void caseAOrLogicsymbol(AOrLogicsymbol node)
    {
        defaultCase(node);
    }

    public void caseAResidueResidue(AResidueResidue node)
    {
        defaultCase(node);
    }

    public void caseAResiduenotResidue(AResiduenotResidue node)
    {
        defaultCase(node);
    }

    public void caseAResidueinvertResidue(AResidueinvertResidue node)
    {
        defaultCase(node);
    }

    public void caseAExcludestatement(AExcludestatement node)
    {
        defaultCase(node);
    }

    public void caseASelectstatement(ASelectstatement node)
    {
        defaultCase(node);
    }

    public void caseAExactlySelectstatement2(AExactlySelectstatement2 node)
    {
        defaultCase(node);
    }

    public void caseAAtleastSelectstatement2(AAtleastSelectstatement2 node)
    {
        defaultCase(node);
    }

    public void caseANotmorethanSelectstatement2(ANotmorethanSelectstatement2 node)
    {
        defaultCase(node);
    }

    public void caseAAtleastnotmorethanSelectstatement2(AAtleastnotmorethanSelectstatement2 node)
    {
        defaultCase(node);
    }

    public void caseASelectlist(ASelectlist node)
    {
        defaultCase(node);
    }

    public void caseAListitems(AListitems node)
    {
        defaultCase(node);
    }

    public void caseAScorecondition(AScorecondition node)
    {
        defaultCase(node);
    }

    public void caseAScorelist(AScorelist node)
    {
        defaultCase(node);
    }

    public void caseAStatementScoreitem(AStatementScoreitem node)
    {
        defaultCase(node);
    }

    public void caseAMaxScoreitem(AMaxScoreitem node)
    {
        defaultCase(node);
    }

    public void caseAScoreitems(AScoreitems node)
    {
        defaultCase(node);
    }

    public void caseAIntegerNumber(AIntegerNumber node)
    {
        defaultCase(node);
    }

    public void caseAFloatNumber(AFloatNumber node)
    {
        defaultCase(node);
    }

    public void caseTMin(TMin node)
    {
        defaultCase(node);
    }

    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    public void caseTExclude(TExclude node)
    {
        defaultCase(node);
    }

    public void caseTSelect(TSelect node)
    {
        defaultCase(node);
    }

    public void caseTFrom(TFrom node)
    {
        defaultCase(node);
    }

    public void caseTAtleast(TAtleast node)
    {
        defaultCase(node);
    }

    public void caseTExactly(TExactly node)
    {
        defaultCase(node);
    }

    public void caseTNotmorethan(TNotmorethan node)
    {
        defaultCase(node);
    }

    public void caseTScore(TScore node)
    {
        defaultCase(node);
    }

    public void caseTMax(TMax node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTMapper(TMapper node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTInteger(TInteger node)
    {
        defaultCase(node);
    }

    public void caseTFloat(TFloat node)
    {
        defaultCase(node);
    }

    public void caseTAminoAcid(TAminoAcid node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(Node node)
    {
    }
}
