package com.example.SpringDockerExample.datatable;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/data-table-metadata")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DataTableMetadataController {
	private static final DataTableMetadata EMPLOYEE_DEFINATION_METADATA;
	
	 static {
		 EMPLOYEE_DEFINATION_METADATA=new DataTableMetadata()
	                .addColumnMetadata(new ColumnMetadata("", "id", "empId", ColumnType.RADIO, 10))
	                .addColumnMetadata(new ColumnMetadata("Employee Name", "empName","empName" , ColumnType.TEXT, 45))
	                .addColumnMetadata(new ColumnMetadata("Email-ID","email","email",ColumnType.TEXT,45));
	 }
	    @GetMapping(value = "/employee")
	    public DataTableMetadata getEmployeeDataTableMetadata() {
	        return EMPLOYEE_DEFINATION_METADATA;
	    }
}
