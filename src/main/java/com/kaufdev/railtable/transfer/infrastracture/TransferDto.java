package com.kaufdev.railtable.transfer.infrastracture;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class TransferDto {
    private final LocalDateTime outboundTime;
    private final LocalDateTime arrivalTime;
    private final StationDto startStation;
    private final StationDto endStation;
    private final String operator; //TODO Maciek - when thera are interchanges, temporary here is null.
    private final BigDecimal firstClassPrice;
    private final BigDecimal secondClassPrice;
    private final List<InterchangeTransferDto> interchangeTransfers;


    public TransferDto(LocalDateTime outboundTime,
                       LocalDateTime arrivalTime,
                       StationDto startStation,
                       StationDto endStation,
                       String operator,
                       BigDecimal firstClassPrice,
                       BigDecimal secondClassPrice,
                       List<InterchangeTransferDto> interchangeTransfers) {
        this.outboundTime = outboundTime;
        this.arrivalTime = arrivalTime;
        this.startStation = startStation;
        this.endStation = endStation;
        this.operator = operator;
        this.firstClassPrice = firstClassPrice;
        this.secondClassPrice = secondClassPrice;
        this.interchangeTransfers = interchangeTransfers;
    }

    public List<InterchangeTransferDto> getInterchangeTransfers() {
        return interchangeTransfers;
    }

    public LocalDateTime getOutboundTime() {
        return outboundTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public String getOperator() {
        return operator;
    }

    public BigDecimal getFirstClassPrice() {
        return firstClassPrice;
    }

    public BigDecimal getSecondClassPrice() {
        return secondClassPrice;
    }

    public StationDto getStartStation() {
        return startStation;
    }

    public StationDto getEndStation() {
        return endStation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferDto that = (TransferDto) o;
        return Objects.equals(outboundTime, that.outboundTime) && Objects.equals(arrivalTime, that.arrivalTime) && Objects.equals(startStation, that.startStation) && Objects.equals(endStation, that.endStation) && Objects.equals(operator, that.operator) && Objects.equals(firstClassPrice, that.firstClassPrice) && Objects.equals(secondClassPrice, that.secondClassPrice) && Objects.equals(interchangeTransfers, that.interchangeTransfers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outboundTime, arrivalTime, startStation, endStation, operator, firstClassPrice, secondClassPrice, interchangeTransfers);
    }

    @Override
    public String toString() {
        return "TransferDto{" +
                "outboundTime=" + outboundTime +
                ", arrivalTime=" + arrivalTime +
                ", startStation=" + startStation +
                ", endStation=" + endStation +
                ", operator='" + operator + '\'' +
                ", firstClassPrice=" + firstClassPrice +
                ", secondClassPrice=" + secondClassPrice +
                ", interchangeTransfers=" + interchangeTransfers +
                '}';
    }
}
