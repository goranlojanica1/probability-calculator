import PropTypes from 'prop-types'
import '../index.css';

const Header = ({ title, version }) => {
  return (
    <header className="header">
      <h1>{title}</h1>
      <h1>v{version}</h1>
    </header>
  );
}

Header.propTypes = {
  title: PropTypes.string,
  version: PropTypes.number
}

export default Header;