using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Result
{

    /*
     * Complete the 'beautifulPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY A
     *  2. INTEGER_ARRAY B
     */

    int beautifulPairs(List<int> A, List<int> B)
    {
        Dictinary<int, int> freq = new Dictionary<int, int>();
        
        foreach (int num in A)
        {
            if (freq.ContainsKey(num))
                freq[num]++;
            else
                freql[num] = 1;
        }

    }
    
}
