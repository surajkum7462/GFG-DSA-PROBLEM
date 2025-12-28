
class Solution {
    
    static String longestPalindrome(String s) {
        // code here
       int max=0,start=0,end=0;
    
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                
              if(checkPalindrome(s,i,j))
              {
                  if((j-i+1)>max)
                  {
                      max=j-i+1;
                      start=i;
                      end=j;
                  }
              }
            }
        }
        return s.substring(start,end+1);
    }
    public static boolean  checkPalindrome(String str,int l,int r)
    {
       
        while(l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}