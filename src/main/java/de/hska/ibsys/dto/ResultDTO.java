package de.hska.ibsys.dto;

import de.hska.ibsys.result.Results;

/**
 *
 * @author p0004
 */
public class ResultDTO {
    
    private Results result;
    
    private Integer SalesOrdersP1 = 0;
    private Integer SalesOrdersP2 = 0;
    private Integer SalesOrdersP3 = 0;
    private Integer ForcastP1f1 = 0;
    private Integer ForcastP2f1 = 0;
    private Integer ForcastP3f1 = 0;
    private Integer ForcastP1f2 = 0;
    private Integer ForcastP2f2 = 0;
    private Integer ForcastP3f2 = 0;
    private Integer ForcastP1f3 = 0;
    private Integer ForcastP2f3 = 0;
    private Integer ForcastP3f3 = 0;
    
    private Integer selldirectQuantityP1 = 0;
    private Double selldirectPriceP1 = Double.valueOf(0);
    private Double selldirectPenaltyP1 = Double.valueOf(0);
    private Integer selldirectQuantityP2 = 0;
    private Double selldirectPriceP2 = Double.valueOf(0);
    private Double selldirectPenaltyP2 = Double.valueOf(0); 
    private Integer selldirectQuantityP3 = 0;
    private Double selldirectPriceP3 = Double.valueOf(0);
    private Double selldirectPenaltyP3 = Double.valueOf(0);
    
    
    public ResultDTO() {
    }

    public ResultDTO(Results result) {
        this.result = result;
    }

    public Integer getForcastP1f1() {
        return ForcastP1f1;
    }

    public void setForcastP1f1(Integer ForcastP1f1) {
        this.ForcastP1f1 = ForcastP1f1;
    }

    public Integer getForcastP1f2() {
        return ForcastP1f2;
    }

    public void setForcastP1f2(Integer ForcastP1f2) {
        this.ForcastP1f2 = ForcastP1f2;
    }

    public Integer getForcastP1f3() {
        return ForcastP1f3;
    }

    public void setForcastP1f3(Integer ForcastP1f3) {
        this.ForcastP1f3 = ForcastP1f3;
    }

    public Integer getForcastP2f1() {
        return ForcastP2f1;
    }

    public void setForcastP2f1(Integer ForcastP2f1) {
        this.ForcastP2f1 = ForcastP2f1;
    }

    public Integer getForcastP2f2() {
        return ForcastP2f2;
    }

    public void setForcastP2f2(Integer ForcastP2f2) {
        this.ForcastP2f2 = ForcastP2f2;
    }

    public Integer getForcastP2f3() {
        return ForcastP2f3;
    }

    public void setForcastP2f3(Integer ForcastP2f3) {
        this.ForcastP2f3 = ForcastP2f3;
    }

    public Integer getForcastP3f1() {
        return ForcastP3f1;
    }

    public void setForcastP3f1(Integer ForcastP3f1) {
        this.ForcastP3f1 = ForcastP3f1;
    }

    public Integer getForcastP3f2() {
        return ForcastP3f2;
    }

    public void setForcastP3f2(Integer ForcastP3f2) {
        this.ForcastP3f2 = ForcastP3f2;
    }

    public Integer getForcastP3f3() {
        return ForcastP3f3;
    }

    public void setForcastP3f3(Integer ForcastP3f3) {
        this.ForcastP3f3 = ForcastP3f3;
    }

    public Integer getSalesOrdersP1() {
        return SalesOrdersP1;
    }

    public void setSalesOrdersP1(Integer SalesOrdersP1) {
        this.SalesOrdersP1 = SalesOrdersP1;
    }

    public Integer getSalesOrdersP2() {
        return SalesOrdersP2;
    }

    public void setSalesOrdersP2(Integer SalesOrdersP2) {
        this.SalesOrdersP2 = SalesOrdersP2;
    }

    public Integer getSalesOrdersP3() {
        return SalesOrdersP3;
    }

    public void setSalesOrdersP3(Integer SalesOrdersP3) {
        this.SalesOrdersP3 = SalesOrdersP3;
    }

    public Results getResult() {
        return result;
    }

    public void setResult(Results result) {
        this.result = result;
    }

    public Double getSelldirectPenaltyP1() {
        return selldirectPenaltyP1;
    }

    public void setSelldirectPenaltyP1(Double selldirectPenaltyP1) {
        this.selldirectPenaltyP1 = selldirectPenaltyP1;
    }

    public Double getSelldirectPenaltyP2() {
        return selldirectPenaltyP2;
    }

    public void setSelldirectPenaltyP2(Double selldirectPenaltyP2) {
        this.selldirectPenaltyP2 = selldirectPenaltyP2;
    }

    public Double getSelldirectPenaltyP3() {
        return selldirectPenaltyP3;
    }

    public void setSelldirectPenaltyP3(Double selldirectPenaltyP3) {
        this.selldirectPenaltyP3 = selldirectPenaltyP3;
    }

    public Double getSelldirectPriceP1() {
        return selldirectPriceP1;
    }

    public void setSelldirectPriceP1(Double selldirectPriceP1) {
        this.selldirectPriceP1 = selldirectPriceP1;
    }

    public Double getSelldirectPriceP2() {
        return selldirectPriceP2;
    }

    public void setSelldirectPriceP2(Double selldirectPriceP2) {
        this.selldirectPriceP2 = selldirectPriceP2;
    }

    public Double getSelldirectPriceP3() {
        return selldirectPriceP3;
    }

    public void setSelldirectPriceP3(Double selldirectPriceP3) {
        this.selldirectPriceP3 = selldirectPriceP3;
    }

    public Integer getSelldirectQuantityP1() {
        return selldirectQuantityP1;
    }

    public void setSelldirectQuantityP1(Integer selldirectQuantityP1) {
        this.selldirectQuantityP1 = selldirectQuantityP1;
    }

    public Integer getSelldirectQuantityP2() {
        return selldirectQuantityP2;
    }

    public void setSelldirectQuantityP2(Integer selldirectQuantityP2) {
        this.selldirectQuantityP2 = selldirectQuantityP2;
    }

    public Integer getSelldirectQuantityP3() {
        return selldirectQuantityP3;
    }

    public void setSelldirectQuantityP3(Integer selldirectQuantityP3) {
        this.selldirectQuantityP3 = selldirectQuantityP3;
    }
}