package com.seochan2.saru.aws;

import java.util.List;

import com.amazonaws.services.cloudwatch.model.Datapoint;

public interface AwsReportService {

	public abstract List<Datapoint> getMetricStatisticsReport(String namespace, String metricName,
	        int periodSec, String statistics, String dimensionName, String dimensionValue,
	        String startDate, String endDate) throws Exception;

}
