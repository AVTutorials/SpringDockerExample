package com.example.SpringDockerExample.datatable;

import java.util.ArrayList;
import java.util.List;

public class DataTableMetadata {
	private List<ColumnMetadata> columnsMetadata = new ArrayList<>();

	/**
	 * This method follows hybrid builder pattern to ease the process of
	 * DataTableMetadata creation.
	 * 
	 * @param columnMetadata column related data. See {@link ColumnMetadata}
	 * @return DataTableMetadata instance so that we can add more column metadata.
	 */
	public DataTableMetadata addColumnMetadata(ColumnMetadata columnMetadata) {
		this.columnsMetadata.add(columnMetadata);
		return this;
	}

	public List<ColumnMetadata> getColumnsMetadata() {
		return columnsMetadata;
	}
}
