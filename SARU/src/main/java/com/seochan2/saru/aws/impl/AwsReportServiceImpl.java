package com.seochan2.saru.aws.impl;

import java.util.List;

import com.amazonaws.services.cloudwatch.model.Datapoint;
import com.seochan2.saru.aws.AwsReportService;

public class AwsReportServiceImpl implements AwsReportService{

	@Override
	public List<Datapoint> getMetricStatisticsReport(String namespace, String metricName,
	        int periodSec, String statistics, String dimensionName, String dimensionValue,
	        String startDate, String endDate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
