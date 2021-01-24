package me.xxxelppa.study.week08;

public interface Exam_001 {
    /*
     * ERROR CASE
     *
     * public static final int test_01;        // Variable 'test_01' might not have been initialized
     * protected final int test_02 = 10;       // Modifier 'protected' not allowed here
     * private static final int test_03 = 10;  // Modifier 'private' not allowed here
     *
     * private void mTest_01();    // Modifier 'private' not allowed here
     * protected void mTest_02();  // Modifier 'protected' not allowed here
     * void mTest_03() { }         // Interface abstract methods cannot have body
     */
    
    
    /*
     * CAN USE CASE
     */
    int test_01 = 10;
    static int test_02 = 10;                // Modifier 'static' is redundant for interface fields
    final int test_03 = 10;                 // Modifier 'final' is redundant for interface fields
    public static int test_04 = 10;         // Modifier 'public' is redundant for interface fields, Modifier 'static' is redundant for interface fields
    public final int test_05 = 10;          // Modifier 'public' is redundant for interface fields, Modifier 'final' is redundant for interface fields
    public static final int test_06 = 10;   // Modifier 'public' is redundant for interface fields, Modifier 'static' is redundant for interface fields, Modifier 'final' is redundant for interface fields
    
    void mTest_03();
    abstract void mTest_02();               // Modifier 'abstract' is redundant for interface methods
    public abstract void mTest_01();        // Modifier 'public' is redundant for interface methods, Modifier 'abstract' is redundant for interface methods
    
}
