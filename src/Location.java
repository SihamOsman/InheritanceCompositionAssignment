public class Location {
        private String region;
        private String country;

        public Location(String region, String country) {
            this.region = region;
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

    @Override
    public String toString() {
        return "Location {" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}

