import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDagTest {xccxcxcx

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter out=new FileWriter("C:/Users/krishna/Desktop/krishna.py");
		BufferedWriter writer=new BufferedWriter(out);
		
		int interval=30;
		int delta=5;
		String callableFunc="damageReturnETL";
		String folderPath="'/Users/gv/airflow/dags/examples/return_analytics'";
		
		String owner="'gri'";
		String depends_on_past="False";
		String start_date="datetime(2020, 12, 4)";
		String email="['gri@everforce.com']";
		String email_on_failure="True";
		String email_on_retry="True";
		String retries="1";
		String retry_delay="timedelta(minutes="+delta+"),\n";
		
		
		
		
		writer.write("import sys\n");
		writer.write("from datetime import datetime, timedelta\n");
		writer.write("from airflow import DAG sys\n");
		writer.write("from airflow.models import Variable\n");
		writer.write("from airflow.operators.python_operator import PythonOperator\n\n");
		writer.write("sys.path.append("+folderPath+")\n\n");
		writer.write("from damage_return_etl import damageReturnETL\n\n");
		
		
		writer.write("default_args = {\n");
		writer.write("'owner': "+owner+",\n");
		writer.write("'depends_on_past': "+depends_on_past+",\n");
		writer.write("'start_date': "+start_date+",\n");
		writer.write("'email': "+email+",\n");
		writer.write("'email_on_failure': "+email_on_failure+",\n");
		writer.write("'email_on_retry': "+email_on_retry+",\n");
		writer.write("'retries': "+retries+",\n");
		writer.write("'retry_delay': "+retry_delay+",\n");
		writer.write("}\n\n");
		
		writer.write("dag = DAG('DAG_damage_return_etl', default_args=default_args, schedule_interval="+"\"*/"+interval+" * * * *\")\n\n");
		
		writer.write("process_dag = PythonOperator(\n");
		
		for(int x=1;x<2;x++) {
			String tid="'task_id"+x+"'";
			writer.write("task_id="+tid+",\n");
		}
		writer.write("python_callable="+callableFunc+",\n");
		writer.write("dag=dag)");
		
		
		
		writer.flush();
		writer.close();
		

	}

}
