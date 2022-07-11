package example;

import java.io.*;

class Example3 {
    private int values[];

    Example3(int values[]) {
        this.values = values;
    }

    int[] getIntValues() {
        return this.values;
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
    }
}
