import { useState } from 'react';
import Select from 'react-select';
import '../index.css';

const SelectItems = ({ text, items, componentName, onDataChange }) => {
  
  return (
    <fieldset className="select-item">
      <legend>{text}</legend>
      <Select
        className="weakness-select" 
        styles={{
          valueContainer: (base) => ({
            ...base,
            background: "#1b1f23",
          }),
          container: (base) => ({
            ...base,
            backgroundColor: "#ffffff",
            padding: 1,
          }),
        }}
        theme={(theme) => ({
          ...theme,
          borderRadius: 0,
          colors: {
            ...theme.colors,
            primary: "#ffffff",
          }
        })}
        isMulti
        isClearable
        isSearchable
        name={componentName}
        onChange={onDataChange}
        closeMenuOnSelect={false}
        options={items}
      />
    </fieldset>
  );
}

export default SelectItems;