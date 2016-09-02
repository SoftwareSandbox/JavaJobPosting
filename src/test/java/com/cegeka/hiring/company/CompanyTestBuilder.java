package com.cegeka.hiring.company;

public class CompanyTestBuilder {
    private String name;

    public static CompanyTestBuilder company() {
        return new CompanyTestBuilder();
    }

    public CompanyTestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public Company build() {
        return new Company();
    }
}
