package Basic;
class animal implements Dogs {
    String name;
    String color;
    String breed;
    String hungry;
Void barking(String newValue){
     name = newValue;
}
 Void fetching(String newValue){
color = newValue;
}
 Void wagging_tail(String newValue, newValue1){
 breed = newValue;
hungry = newValue1;
}
Void print() {
System.out.println(“name:” +name+ “color:”+color+”breed:”+breed+”hungry:”+hungry);
}
}
