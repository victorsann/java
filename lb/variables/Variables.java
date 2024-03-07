package lb.variables;

public class Variables {

    // Instance Variables (Non-static Fields)

    int instanceVariable = 0;

    // Their values are unique to each instance of a class (to each object);

    // Class Variables (Static Fields)

    static int classVariable = 0;

    // A class variable is any field declared with the static modifier; this tells
    // the compiler that there is exactly one copy of this variable in existence,
    // regardless of how many times the class has been instantiated.

    void method(int args) {

        int localVariable = 0; // Local Variables: Variables implemented in a method;

        args = localVariable; // Parameters

    }

}
