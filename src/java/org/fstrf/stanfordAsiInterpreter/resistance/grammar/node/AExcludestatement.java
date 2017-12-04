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

package org.fstrf.stanfordAsiInterpreter.resistance.grammar.node;

import java.util.*;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.analysis.*;

public final class AExcludestatement extends PExcludestatement
{
    private TExclude _exclude_;
    private PResidue _residue_;

    public AExcludestatement()
    {
    }

    public AExcludestatement(
        TExclude _exclude_,
        PResidue _residue_)
    {
        setExclude(_exclude_);

        setResidue(_residue_);

    }
    public Object clone()
    {
        return new AExcludestatement(
            (TExclude) cloneNode(_exclude_),
            (PResidue) cloneNode(_residue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExcludestatement(this);
    }

    public TExclude getExclude()
    {
        return _exclude_;
    }

    public void setExclude(TExclude node)
    {
        if(_exclude_ != null)
        {
            _exclude_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _exclude_ = node;
    }

    public PResidue getResidue()
    {
        return _residue_;
    }

    public void setResidue(PResidue node)
    {
        if(_residue_ != null)
        {
            _residue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _residue_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_exclude_)
            + toString(_residue_);
    }

    void removeChild(Node child)
    {
        if(_exclude_ == child)
        {
            _exclude_ = null;
            return;
        }

        if(_residue_ == child)
        {
            _residue_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_exclude_ == oldChild)
        {
            setExclude((TExclude) newChild);
            return;
        }

        if(_residue_ == oldChild)
        {
            setResidue((PResidue) newChild);
            return;
        }

    }
}