import { useState, useEffect } from 'react';
import axios from 'axios';
import Header from './components/Header';
import RadioButton from './components/RadioButton'
import TableResults from './components/TableResult';
import SelectItems from './components/SelectItems';
import Button from './components/Button';
import './index.css';

function App() {
  const [weaknesses, setWeaknesses] = useState([]);
  const [calculatorInput, setCalculatorInput] = useState({
    maintenance: "",
    manufacturer: "",
    localAccess: "",
    hardware: "",
    firewallConfiguration: "",
    passwordStrength: "",
    selectedWeaknesses: [],
  });
  const [results, setResults] = useState([]);

  useEffect(() => {
    getWeaknesses();
  }, [])

  const getWeaknesses = () => {
    axios.get(`${process.env.REACT_APP_API_URL}/weakness`)
      .then((response) => {
        let weaknessesForSelect = []; 
        response.data.forEach(weakness => {
          weaknessesForSelect.push({value: weakness.name, label: weakness.name});
        });
        setWeaknesses(weaknessesForSelect);
      })
      .catch((error) => {
        console.log(error.response);
      });
  }

  const calculateProbability = () => {
    axios.post(`${process.env.REACT_APP_API_URL}/calculator/calculate`, JSON.stringify(calculatorInput),
      {
        headers: { 'Content-Type': 'application/json' }
      })
      .then((response) => {
        setResults(response.data);
      })
      .catch((error) => {
        console.log(error.response);
      });
  }

  const handleDataChangeForRadioButton = (e) => {
    const inputFieldName = e.target.getAttribute('name');
    const inputFieldValue = e.target.value;

    const newData = { ...calculatorInput };
    newData[inputFieldName] = inputFieldValue;

    setCalculatorInput(newData);
  }

  const handleDataChangeForSelect = (items) => {
    let selectItems = [];
    items.forEach(item => {
      selectItems.push(item.value);
    });

    const newData = { ...calculatorInput };
    newData['selectedWeaknesses'] = selectItems;

    setCalculatorInput(newData);
  }

  return (
    <div className="container">
      <div className="header-container">
        <Header title="Probability Calculator" version={1} />
      </div>
      <div className="information-container">
        <p className="information">The calculator can find probability that a certain hardware attack can occur using Bayesian network to calculate probabilties based on user input.<br/>
        Information about all attacks can be found on <a href="https://capec.mitre.org/data/definitions/515.html">CAPEC</a>.<br/><br/>
        Select all fields you are familiar with.<br/>
        The calculator does not need all the information but the more information is provided the more precise probabilities will be.</p>
      </div>
      <div className="calculator-container">
        <div className="select-fields">
          <RadioButton text="How often is system updated and maintained?" options={[{value: "Regularly", label: "Regularly"}, {value: "Rarely", label: "Rarely"}]} radioButtonName="maintenance" onDataChange={handleDataChangeForRadioButton} />
          <RadioButton text="What about manufacturer?" options={[{value: "Trusted", label: "Trusted and licenced"}, {value: "Suspicious", label: "Unfamiliar and suspicious"}]} radioButtonName="manufacturer" onDataChange={handleDataChangeForRadioButton} />
          <RadioButton text="Is local access possible?" options={[{value: "Protected", label: "No, it is protected"}, {value: "Unprotected", label: "Yes, everyone has access"}]} radioButtonName="localAccess" onDataChange={handleDataChangeForRadioButton} />
          <RadioButton text="What about hardware age?" options={[{value: "Modern", label: "It is modern"}, {value: "Outdated", label: "Is is outdated"}]} radioButtonName="hardware" onDataChange={handleDataChangeForRadioButton} />
          <RadioButton text="What about firewall configuration?" options={[{value: "Good", label: "It is properly configured"}, {value: "Poor", label: "It is poorly configured"}]} radioButtonName="firewallConfiguration" onDataChange={handleDataChangeForRadioButton} />
          <RadioButton text="What about password strength?" options={[{value: "Strong", label: "Strong"}, {value: "Weak or default", label: "Weak or default"}]} radioButtonName="passwordStrength" onDataChange={handleDataChangeForRadioButton} />
          <SelectItems text="If you know other weaknesses please select them" items={weaknesses} componentName="selectedWeaknesses" onDataChange={handleDataChangeForSelect} />
          <div className="button-container">
            <Button text="CALCULATE PROBABILITIES" onClick={calculateProbability} />
          </div>
        </div>
        <div className="result">
          {results.length ? <TableResults results={results} /> : 
            <p className="results-note">Results will be shown here</p>
          }
        </div>
      </div>
    </div>
  );
}

export default App;
