public class MyClass {
    public static int get_adder(int value1,int value2){
        // value 1 take care of addition 
        // value 2 take care of carry
    
        int carry=0;
        while(value2!=0){
            carry = value1&value2;
            value1 = (value1^value2);
            value2=carry<<1;
        }
        int result = value1;
        return result;
    }
    public static int get_substracter(int value1,int value2){
        // 2's complement of value 2
        // add value 1 and value 2
        value2 = ~value2;
        value2+=1;
        return value1+value2;
    }
    public static void main(String args[]) {
      int value1 = 13;
      int value2 = 4;
      String binary_value1 = get_binary_value(value1);
      String binary_value2 = get_binary_value(value2);
      System.out.println("Value 1-> "+value1+" " +"Binary->" + binary_value1+ " "+" Value 2-> "+value2+  " "+ "Binary-> "+ binary_value2);
      int addition = get_adder(value1,value2);
      System.out.println("Ans after addition "+addition + " " + "Binary-> "+get_binary_value(addition));
      int substraction = get_substracter(value1,value2);
      System.out.println("Ans after substraction "+substraction + " " + "Binary-> "+get_binary_value(substraction));
      
    }
    public static String get_binary_value(int value){
    int len =0;
    int temp = value;
    String answer = "";
    while(temp != 0){
        len+=1;
        temp>>=1;
    }    
    temp = len;
    while(temp!=0){
        int pointer = 1<<(len - temp);
        if ((pointer & value )==0){
            answer += "0";
        }
        else{
            answer += "1";
        }
        temp-=1;
    }
    String result="";
    int space = 32-answer.length();
    for(int i=0;i<space;i++){
        result+="0";
    }
    result+=answer;
    return answer;
}
}