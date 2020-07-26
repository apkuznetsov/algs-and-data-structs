package datastructs.hashtable;

public class Hashtable<T> {

    private final int size;
    private HashtableEntry[] table;

    public Hashtable(int size) {
        this.size = size;
        table = new HashtableEntry[size];
    }

    private int findEntryIndex(int key) {
        int hash = key % size;

        while (!(table[hash] == null
                || table[hash].getKey() == key)) {

            hash = (hash + 1) % size;

            if (hash == key % size) {
                return -1;
            }
        }

        return hash;
    }

    public boolean put(int key, T value) {
        int idx = findEntryIndex(key);

        if (idx == -1) {
            return false;
        }

        table[idx] = new HashtableEntry<>(key, value);
        return true;
    }

    public T get(int key) {
        int idx = findEntryIndex(key);

        if (idx == -1 || table[idx] == null) {
            return null;
        }

        return (T) table[idx].getValue();
    }

    @Override
    public String toString() {
        StringBuilder tableSb = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                tableSb.append(i).append(": null");
            } else {
                tableSb.append(i)
                        .append(": key=").append(table[i].getKey())
                        .append(", value=").append(table[i].getValue());
            }

            if (i < table.length - 1) {
                tableSb.append("\n");
            }
        }

        return tableSb.toString();
    }
}
