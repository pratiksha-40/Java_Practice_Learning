import java.lang.Integer;
public class Integer1 {
    public static void main(String[] args){

     Integer int_obj= Integer.valueOf(4);
     System.out.println("The int_obj:"+int_obj);

     //valueOf():converts data from its internal form in a human redable form
     Integer int_obj1= Integer.valueOf(4);

     //.equals():- check the integer obj compare to other integer obj
     System.out.println("The integer is equals:" +int_obj.equals(int_obj1));

     //.hashcode():prviding uniqe value to hashcode of int type of obj
     System.out.println("The integer is hashcode:" +int_obj.hashCode(int_obj1));

     //.byteValue():returns the numeric value represented by this object after conversion to the primitive byte type.
     System.out.println("The integer is byteValues:" +int_obj.byteValue());

     //.compareTo():compares two Integer objects numerically and returns 0 if comparison is matched else 1 print.
     System.out.println("The integer is compareto:" +int_obj.compareTo(int_obj1)); 
      
     //.parseInt(): convert string in decimal signed int obj
     String str="100";
     System.out.println("The integer is ParseInt:" +Integer.parseInt(str)); 
     System.out.println("------------------------------------------------------");


     //parseFloat():convert string in decimal signed float obj
     String s="100";
     System.out.println("The Float is ParseFloat:" +Float.parseFloat(s)); 

     //floatToIntBits(): 
     System.out.println("The Float is FloatToIntBits:" +Float.floatToIntBits(1.8f)); 

     //valueof():converts data from its internal form in a human redable form
     Float f1=Float.valueOf(1);
     Float ff=Float.valueOf(1.0f);

    //equals(): check the float obj compare to other float obj
     System.out.println("The Float is equals:" +f1.equals(ff));

     //floatValue(): it convert normal value to the float value
     System.out.println("The Float is value:" +f1.floatValue());

     //inBitsToFloat():
     System.out.println("The Float is inBitsToFloat:" +Float.intBitsToFloat(3));
     System.out.println("------------------------------------------------------");

    //valueOf():converts data from its internal form in a human redable form
     Double d1=Double.valueOf(3);
     Double d2=Double.valueOf(3.4445d);
     //equals():
     System.out.println("The Double has equal:"+d1.equals(d2));

     //doubleValues():
     System.out.println("The Double has doublevalue:"+d1.doubleValue());

    //compareTo():compares two Double objects numerically and returns 0 if comparison is matched else -1 print
     System.out.println("The Double has compareTo:" + d1.compareTo(d2));

     //parseDouble():convert string in decimal signed Double obj
     String sd="189.0";
     System.out.println("The Double has parseDouble:" + Double.parseDouble(sd));
     System.out.println("------------------------------------------------------");

    //valueOf():converts data from its internal form in a human redable form
     Short s1=Short.valueOf((short)89);
     Short s3=Short.valueOf((short)89);

     System.out.println("The short has valueOf:"+s1);

    //parseShort():convert string in decimal signed short obj
    String s2="30000";
     System.out.println("The short has parseShort:"+ Short.parseShort(s2, 10));
    
     //reverseBytes():sed to return the value obtained by reversing the order of the bytes in the two's complement representation of the specified short value.
     Short st=56;
     System.out.println("The short has reverseBytes:"+ Short.reverseBytes(st));

    //toString():returns a String object representing this Short object value.
     System.out.println("The short has toString:"+ Short.toString(st));

    //compareTo():compares two Short objects numerically and returns 0 if comparison is matched else -1 print
     System.out.println("The short has compareTo:" + s1.compareTo(s3));    

    //decode():A string is converted into a short by Java Short decode() method of the Short class.
     Short decodedS3 = Short.decode(s2);
     System.out.println("The short has compareTo(decode): " + s1.compareTo(decodedS3));       

     
    }
}
