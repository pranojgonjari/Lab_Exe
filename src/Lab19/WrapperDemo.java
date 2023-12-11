package Lab19;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Problem Statement 1: Checking important methods of wrapper classes

        // Integer Wrapper Class
        Integer integerObject1 = new Integer(42);
        Integer integerObject2 = Integer.valueOf(42);

        System.out.println("Integer Wrapper Class Demo:");
        System.out.println("intValue(): " + integerObject1.intValue());
        System.out.println("equals(): " + integerObject1.equals(integerObject2));
        System.out.println("compareTo(): " + integerObject1.compareTo(integerObject2));
        System.out.println("toString(): " + integerObject1.toString());
        System.out.println();

        // Double Wrapper Class
        Double doubleObject1 = new Double(3.14);
        Double doubleObject2 = Double.valueOf(3.14);

        System.out.println("Double Wrapper Class Demo:");
        System.out.println("doubleValue(): " + doubleObject1.doubleValue());
        System.out.println("equals(): " + doubleObject1.equals(doubleObject2));
        System.out.println("compareTo(): " + doubleObject1.compareTo(doubleObject2));
        System.out.println("toString(): " + doubleObject1.toString());
        System.out.println();

        // Boolean Wrapper Class
        Boolean booleanObject1 = new Boolean(true);
        Boolean booleanObject2 = Boolean.valueOf(true);

        System.out.println("Boolean Wrapper Class Demo:");
        System.out.println("booleanValue(): " + booleanObject1.booleanValue());
        System.out.println("equals(): " + booleanObject1.equals(booleanObject2));
        System.out.println("compareTo(): " + booleanObject1.compareTo(booleanObject2));
        System.out.println("toString(): " + booleanObject1.toString());
        System.out.println();

        // Problem Statement 2: Checking AutoBoxing and AutoUnBoxing

        // AutoBoxing
        int primitiveInt = 123;
        Integer boxedInt = primitiveInt;

        // AutoUnBoxing
        Double primitiveDouble = 3.14;
        double unboxedDouble = primitiveDouble;

        System.out.println("AutoBoxing and AutoUnBoxing Demo:");
        System.out.println("AutoBoxing: " + boxedInt);
        System.out.println("AutoUnBoxing: " + unboxedDouble);
	}

}
