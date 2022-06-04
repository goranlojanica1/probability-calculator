import '../index.css';

const TableResults = ({ results }) => {
  return(
    <table>
      <tbody>
        <tr>
          <th>Attack name</th>
          <th>Probability</th>
        </tr>
        {results.map((result) =>
          <tr key={result.attackName}>
            <td>{result.attackName}</td>
            <td>{(result.probability*100).toFixed(3)}%</td>
          </tr>
        )}
      </tbody>
    </table>
  );
}

export default TableResults;