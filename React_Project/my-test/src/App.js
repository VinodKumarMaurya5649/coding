function MyButton() {
  return (
    <div className="MyButton">
      <button>this is button</button>
    </div>

  );
}
function Fruit() {
  const arr = ['apple', 'banana', 'mango']
  return (
    <ul>
      {arr.map((item, idx) => (
        <li key={idx}>{item}</li>
      ))}
    </ul>
  )
}
function App() {

  return (

    <div className="App">
      <h1>
        this is class
      </h1>
      <MyButton />
      <Fruit />
    </div>
  );
}

export default App;
