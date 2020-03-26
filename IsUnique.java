private boolean isUniqueBruteForce(String s) {

        for (int i=0;i<s.toCharArray().length;i++) {
            for (int j=i+1;j<s.toCharArray().length;j++) {
                if(s.toCharArray()[i] == s.toCharArray()[j])
                    return false;
            }
        }

        return true;
    }

    private boolean isUnique(String s) {
        if (s.length() > 128) return false;
        
        boolean[] bArray = new boolean[128];
        
        for (int i=0;i<s.length();i++) {
            int val = s.charAt(i);
            
            if (bArray[val]) return false;
            
            bArray[val] = true;
        }
        
        return true;
    }