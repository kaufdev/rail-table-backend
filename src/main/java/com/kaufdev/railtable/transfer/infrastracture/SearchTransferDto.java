package com.kaufdev.railtable.transfer.infrastracture;

import java.time.LocalDate;

public class SearchTransferDto {
    private final String stationFrom;
    private final String stationTo;
    private final LocalDate outboundDate;

    public SearchTransferDto(String stationFrom, String stationTo, LocalDate outboundDate) {
        this.stationFrom = stationFrom;
        this.stationTo = stationTo;
        this.outboundDate = outboundDate;
    }

    public String getStationFrom() {
        return stationFrom;
    }

    public String getStationTo() {
        return stationTo;
    }

    public LocalDate getOutboundDate() {
        return outboundDate;
    }

    @Override
    public String toString() {
        return "SearchTransferDto{" +
                "stationFrom='" + stationFrom + '\'' +
                ", stationTo='" + stationTo + '\'' +
                ", outboundDate=" + outboundDate +
                '}';
    }
}