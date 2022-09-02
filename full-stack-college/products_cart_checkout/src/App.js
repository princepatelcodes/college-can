import { useEffect, useState } from 'react';

import data from './data/products';
function App() {

  const [cart, setCart] = useState([]);

  async function addToCart(product) {
    var products = cart;
    products.push(product)

    setCart(products);
    console.log(cart);
    localStorage.setItem('cart', products);

    // To retrieve data


    // // To clear a specific item
    // localStorage.removeItem('Name');

    // // To clear the whole data stored in localStorage
    // localStorage.clear();
  }

  useEffect(() => {
    var data = localStorage.getItem('cart');
    setCart(data == null ? [] : data);
  }, [])


  return (
    <>
      <nav className='navbar navbar-expand-lg navbar-dark bg-primary'>
        <div className="container py-2">
          <p className="navbar-brand fw-bold" >Products</p>
          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav ms-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <button type="button" className="btn btn-warning position-relative">
                  Cart
                  <span className="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger">
                    {cart.length}
                    <span className="visually-hidden">Items in Cart</span>
                  </span>
                </button>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <div className='container py-3'>
        <h1>Products App</h1>
        <h3>Here are some awesome products to explore.</h3>
        <div className='row row-cols-1 row-cols-md-2 row-cols-lg-3 g-4'>
          {data.map((m, i) => {
            return <div className='col' key={m.name}>
              <div className='card'>
                <div className='card-body'>
                  <img src={m.imgUrl} className="img-fluid" width={'200'} alt={m.name} />
                  <h4>{m.name}</h4>
                  <p>Rs {m.price}</p>
                  <button className='btn btn-success' onClick={() => addToCart(m)}>Add to Cart</button>
                </div>
              </div>
            </div>
          })}
        </div>
      </div>
    </>
  );
}

export default App;
