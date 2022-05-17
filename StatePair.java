public class StatePair <Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
    private Type1 value1;
    private Type2 value2;
    
    public StatePair(Type1 val1, Type2 val2) {
        this.value1 = (Type1) val1;
        this.value2 = (Type2) val2;
    }
    
    public void setVal1(Type1 val) {
        value1 = val;
    }
    public void setVal2(Type2 val) {
        value2 = val;
    }
    
    public Type1 getVal1() {
        return value1;
    }
    public Type2 getVal2(){
        return value2;
    }

    public void printInfo() {
        System.out.printf("%s: %s",getVal1(),getVal2());
    }
    // TODO: Define a constructor, mutators, and accessors 
    //       for StatePair
    
    // TODO: Define printInfo() method
 }