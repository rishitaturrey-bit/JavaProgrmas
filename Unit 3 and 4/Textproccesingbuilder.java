class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Builder");

        System.out.println(sb);
    }
}

/*
StringBuilder is faster and not thread-safe.
StringBuffer is slower but thread-safe.
*/
