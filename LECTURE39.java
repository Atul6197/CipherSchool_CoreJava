class Anagrams {
    static boolean isAnagram(String s1, String s2)
    {
        // if length is not equal - they can't be anagrams
        if(s1.length() != s2.length()) return false;

        //let's say -> for our scenario, we can ignore the case of strings
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int n = s1.length();

        int freqArr1[] = new int[26]; //[256] create for 256 if we have to include spaces and all
        int freqArr2[] = new int[26];
//      in frequency Array -> 0 means 'a' and 25 means 'z'

        for(int i=0;i<n;i++)
        {
            //for String i
            int index1 = s1.charAt(i) - 'a';// mapping character to index [relative index with respec to 'a']
            freqArr1[index1]++;

            //for String 2
            int index2 = s2.charAt(i) - 'a';
            freqArr1[index2]++;
        }
        //freq arrays have been created

        for(int i=0; i<26 ; i++)
        {
            if(freqArr1[i]!= freqArr2[i])
            {
                return false;
            }
        }
        //if reached here means freq arrays are equal
        return true;
    }

    public static void main(String [] args)
    {
        System.out.println(isAnagram("CAT","TAC"));
        System.out.println(isAnagram("CAT","TAG"));
        System.out.println(isAnagram("CAT","TACC"));

    }
}