import React from 'react'

export const NavbarComponent = () => {
  return (
        <div>
            <header class="d-flex justify-content-center py-3 bg-light">
            <ul class="nav nav-pills">
                <li class="nav-item"><a href="#" class="nav-link active" aria-current="page">Home</a></li>
                <li class="nav-item"><a href="#" class="nav-link">Users</a></li>
                <li class="nav-item"><a href="#" class="nav-link">Products</a></li>
                <li class="nav-item"><a href="#" class="nav-link">About</a></li>
            </ul>
            </header>
        </div>
  )
}
