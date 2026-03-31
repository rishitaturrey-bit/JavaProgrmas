interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying image filter: " + type);
    }

    public void reset_filter() {
        System.out.println("Reset image filter");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying data filter: " + type);
    }

    public void reset_filter() {
        System.out.println("Reset data filter");
    }
}