public class MyStringBuffer implements IStringBuffer {
    int length = 0;
    int capacity = 16;
    char[] CharList;

    public MyStringBuffer() {
        CharList = new char[capacity];
    }

    public MyStringBuffer(String string) {
        if (null != string) {
            CharList = string.toCharArray();
        }
        length = CharList.length;

        if (capacity < length) {
            capacity = length * 2;
        }
    }
    public static void main(String[] args){
        MyStringBuffer buffer = new MyStringBuffer("helldsfasfasdfawfafaewfwfweafawefo");
        System.out.println(buffer.toString());
        buffer.reverse();
        System.out.println(buffer.toString());
    }
    @Override
    public void reverse() {
        for (int i = 0; i < this.length / 2; i++) {
            char temp = CharList[i];
            CharList[i] = CharList[length - (i + 1)];
            CharList[length-(i+1)] = temp;
        }
    }
    //插入操作需要考虑
    //1. 边界值：- 输入是否null
    //           - 插入位置是否合法
    //2. 扩容： 数组大小不可变，灵活绕过
//                - 是否需要扩容
    //            - 扩容需要扩多大？
    @Override
    public void append(String string) {

    }

    @Override
    public void append(char c) {

    }

    @Override
    public void insert(int pos, char c) {

    }

    @Override
    public void insert(int pos, String string) {

    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

    }

    public String toString(){
        return new String(CharList);
    }
    @Override
    public int length() {
        return this.length;
    }
}
