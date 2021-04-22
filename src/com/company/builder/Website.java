package com.company.builder;

public class Website {

    private String cms;
    private String name;
    private int price;

    public Website() {
    }

    public Website(String cms, String name, int price) {
        this.cms = cms;
        this.name = name;
        this.price = price;
    }

    public WebsiteBuilder builder() {
        return new WebsiteBuilder();
    }

    @Override
    public String toString() {
        return "Website{" +
                "cms='" + cms + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    static class WebsiteBuilder {
        private String cms;
        private String name;
        private int price;

        public WebsiteBuilder setCms(String cms) {
            this.cms = cms;
            return this;
        }

        public WebsiteBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public WebsiteBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Website build() {
            return new Website(cms, name, price);
        }
    }

}
