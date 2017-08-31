package com.mytest.ssm.po;

import java.util.List;

public class RecordsQueryVo {

	private Records records;
	private RecordsCustom recordsCustom;
	private List<RecordsCustom> recordsList;
	public Records getRecords() {
		return records;
	}
	public void setRecords(Records records) {
		this.records = records;
	}
	public RecordsCustom getRecordsCustom() {
		return recordsCustom;
	}
	public void setRecordsCustom(RecordsCustom recordsCustom) {
		this.recordsCustom = recordsCustom;
	}
	public List<RecordsCustom> getRecordsList() {
		return recordsList;
	}
	public void setRecordsList(List<RecordsCustom> recordsList) {
		this.recordsList = recordsList;
	}
	
}
