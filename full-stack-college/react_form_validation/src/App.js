import './App.css';
import { useRef, useState } from 'react';

function App() {

  const email = useRef('');
  const pass = useRef('');
  const [error, seterror] = useState('');
  const [success, setsuccess] = useState('');

  const submitForm = () => {
    const e = email.current.value;
    const p = pass.current.value;
    if (e === '' || p === '') {
      seterror('Please Fill all fields !');
      setsuccess('');
    } else {
      seterror('');
      setsuccess('Submitted !');
    }
  }

  return (
    <div className="App">
      <h1>Welcome</h1>
      <p className='error'>{error}</p>
      <p className='success'>{success}</p>
      <input ref={email} type='email' placeholder='Enter username' />
      <input ref={pass} type='password' placeholder='Enter password' />
      <input onClick={submitForm} type='submit' />
    </div>
  );
}

export default App;
