public class StringBuffer_test {
    public static void main(String[] args){
        Str_connect_time_test(10000);

        Str_Buffer_connect_time_test(10000);

    }

    public static void Str_connect_time_test(int NumofWorlds) {
        long start = System.currentTimeMillis();
        // 随机10位String
        String s = "";
        for (int i = 0; i < NumofWorlds; i++) {
            s += getRandomString(10);
        }
        long end = System.currentTimeMillis();
        System.out.println("String连接时间："+ (end - start));
        System.out.println(s);
    }

    public static void Str_Buffer_connect_time_test(int NumofWorlds){
        long start = System.currentTimeMillis();
        // 随机10位String
        String s = "";
        StringBuffer sb = new StringBuffer(s);

        for (int i = 0; i < NumofWorlds; i++) {
            sb.append(getRandomString(10));
        }

        long end = System.currentTimeMillis();

        System.out.println("StringBuffer连接时间："+ (end - start));
        System.out.println(sb.toString());
    }

    public static String getRandomString(int length) {
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int str_len = str.length();

        char[] CharList = new char[length];
        for (int i = 0; i < length; i++) {
            CharList[i] = str.charAt((int)(Math.random()*str_len)); // 0 - str_len
        }
        return new String(CharList);
    }

}
