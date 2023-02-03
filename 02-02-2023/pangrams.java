class Result {
    public static String pangrams(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for(char c: s.toCharArray()){
            if(Character.isAlphabetic(c)){
                arr[Character.toLowerCase(c)-'a'] = 1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) return "not pangram";
        }
        return "pangram";
    }

}
