package example;

import java.io.*;

class Example4 {
    private int values[];
    private String stringValues[];

    Example4(int values[], String[] stringValues) {
        this.values = values;
        this.stringValues = stringValues;
    }

    int[] getIntValues() {
        return this.values;
    }

    String[] getStringValues() {
        return this.stringValues;
    }

    /**
     * Save member values ('status') to file
     * @param filename
     */
    void save2File(String filename) throws IOException {

        OutputStream os = new FileOutputStream(filename);
        DataOutputStream dos = new DataOutputStream(os);
        for(int i=0; i< values.length; i++){
            dos.writeInt(values[i]);
        }

        PrintStream ps = new PrintStream(os);
        for(int i=0; i< stringValues.length; i++) {
            ps.println(stringValues[i]);
        }
    }

    /**
     * Restore status (member value) from file - overwrite existing value
     * @param filename
     */
    void restoreFromFile(String filename) throws IOException {

        InputStream in = new FileInputStream(filename);
        DataInputStream din = new DataInputStream(in);
        for(int i=0; i<values.length; i++) {
            values[i] = din.readInt();
        }

        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        for(int i=0; i<stringValues.length; i++) {
            stringValues[i] = br.readLine();
        }
    }
}
