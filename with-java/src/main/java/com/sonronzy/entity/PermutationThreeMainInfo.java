package com.sonronzy.entity;

/**
 * 
 *
 * @author sonronzy
 * @date   2024-10-09
 */
public class PermutationThreeMainInfo {
    /**
     * 期号，表主键
     */
    private String uid;

    /**
     * 开奖日期
     */
    private String lotteryDate;

    /**
     * 开奖结果数字
     */
    private String lotteryNumber;

    /**
     * 百位数字
     */
    private String hundredsPlace;

    /**
     * 十位数字
     */
    private String tensPlace;

    /**
     * 个位数字
     */
    private String onesPlace;

    /**
     * getUid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * getLotteryDate
     */
    public String getLotteryDate() {
        return lotteryDate;
    }

    public void setLotteryDate(String lotteryDate) {
        this.lotteryDate = lotteryDate;
    }

    /**
     * getLotteryNumber
     */
    public String getLotteryNumber() {
        return lotteryNumber;
    }

    public void setLotteryNumber(String lotteryNumber) {
        this.lotteryNumber = lotteryNumber;
    }

    /**
     * getHundredsPlace
     */
    public String getHundredsPlace() {
        return hundredsPlace;
    }

    public void setHundredsPlace(String hundredsPlace) {
        this.hundredsPlace = hundredsPlace;
    }

    /**
     * getTensPlace
     */
    public String getTensPlace() {
        return tensPlace;
    }

    public void setTensPlace(String tensPlace) {
        this.tensPlace = tensPlace;
    }

    /**
     * getOnesPlace
     */
    public String getOnesPlace() {
        return onesPlace;
    }

    public void setOnesPlace(String onesPlace) {
        this.onesPlace = onesPlace;
    }
}