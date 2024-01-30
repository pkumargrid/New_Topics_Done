class Util {
    public static int indexOf(String src, String tgt) {
        // your code here
        if(tgt.length() > src.length()){
            return -1;
        }
        if(tgt.equals(src.substring(0,tgt.length()))){
            return 0;
        }
        int get = indexOf(src.substring(1),tgt);
        if(get == -1)return get;
        return 1 + get;
    }
}