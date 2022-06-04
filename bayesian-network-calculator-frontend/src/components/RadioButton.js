import '../index.css';

const RadioButton = ({ text, options, radioButtonName, onDataChange }) => {
  return (
    <fieldset className="select-item">
      <legend>{text}</legend>
      {options.map((option) =>
        <div key={option.value}>
          <input type="radio" id={option.value} name={radioButtonName} value={option.value} onChange={onDataChange} />
          <label htmlFor={option.value}>{option.label}</label>
        </div>
      )}
    </fieldset>
  );
}

export default RadioButton;