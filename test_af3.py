"""Used for unit tests"""
from airflow.models import DAG
from airflow.operators.bash_operator import BashOperator
from airflow.utils.dates import days_ago

dag = DAG(dag_id='test_af3', schedule_interval=None, tags=['example'])

task = BashOperator(
    task_id='test_sleep3',
    dag=dag,
    bash_command="sleep 10000000000",
    start_date=days_ago(2),
    owner='airflow',
)


String POST_DAG_URL = "http://52.12.31.59:9090/admin/rest_api/api?api=deploy_dag";
								try {
									URL obj = new URL(POST_DAG_URL);
									//File logFileToUpload = new File("C:/Users/krishna/Desktop/importants/test_af3.py");
									HttpURLConnection urlcon = (HttpURLConnection) obj.openConnection();
									urlcon.setRequestMethod("POST");
									urlcon.setRequestProperty("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDgxMjA5NjUsIm5iZiI6MTYwODEyMDk2NSwianRpIjoiZjk2ZTlkMDgtMmFmNi00MzJkLWEzMWQtZjZiNjJkNzhhMzRjIiwiZXhwIjoxNjA4MTIxODY1LCJpZGVudGl0eSI6MSwiZnJlc2giOmZhbHNlLCJ0eXBlIjoiYWNjZXNzIn0._1hhpwUi1-L3UWpA2E6p3fJwzHy8KXViUdZlXj_HLmA");
									urlcon.setRequestProperty("rest_api_plugin_http_token", "changeme");
									urlcon.setRequestProperty("Content-Type", "multipart/form-data");
								    urlcon.setRequestProperty("dag_file", fileName);
									int responseCode = urlcon.getResponseCode();
									System.out.println("GET Response Code :: " + responseCode);
									if (responseCode == HttpURLConnection.HTTP_OK) { // success
										
									} else {
										System.out.println("GET request not worked "+urlcon.getResponseMessage());
									}
								  }
								  catch(Exception e) {
									  e.printStackTrace();
								  }