package builderPatternExample;

public class Client {

	public static void main(String[] args) {

		// setup the director
		QueryBuildDirector director = new QueryBuildDirector();
		String from = "Client Table";
		String where = "Client Name = ...";

		QueryBuilder queryBuilder = new SqlQueryBuilder();
		Query query = director.buildQuery(from, where, queryBuilder);
		query.execute();

	}

}
