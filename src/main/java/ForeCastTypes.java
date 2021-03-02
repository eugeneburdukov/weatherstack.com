public enum ForeCastTypes {
    CURRENT("http://api.weatherstack.com/current"),
    HISTORICAL("http://api.weatherstack.com/historical"),
    FORECAST("http://api.weatherstack.com/forecast");

    private String url;

    ForeCastTypes(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
