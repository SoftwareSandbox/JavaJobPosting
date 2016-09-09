package com.cegeka.hiring.company;

public class BenefitsTestBuilder {

    private StringBuilder benefitsBuilder = new StringBuilder();

    public static BenefitsTestBuilder benefits() {
        return new BenefitsTestBuilder();
    }

    private BenefitsTestBuilder(){}

    public Benefits build() {
        return new Benefits(benefitsBuilder.toString());
    }

    public BenefitsTestBuilder flexIncomePlan() {
        this.benefitsBuilder.append("Flex Income Plan");
        return this;
    }

    public BenefitsTestBuilder companyCar() {
        this.benefitsBuilder.append("Company Car");
        return this;
    }

    public BenefitsTestBuilder laptop() {
        this.benefitsBuilder.append("Laptop");
        return this;
    }

    public BenefitsTestBuilder mealVouchers() {
        this.benefitsBuilder.append("Meal Vouchers");
        return this;
    }

    public BenefitsTestBuilder medcare() {
        this.benefitsBuilder.append("Medcare");
        return this;
    }
}
