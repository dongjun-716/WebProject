/*!
* Start Bootstrap - Freelancer v7.0.7 (https://startbootstrap.com/theme/freelancer)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-freelancer/blob/master/LICENSE)
*/
//
// Scripts
// 

window.addEventListener('DOMContentLoaded', event => {

    // Navbar shrink function
    var navbarShrink = function () {
        const navbarCollapsible = document.body.querySelector('#mainNav');
        if (!navbarCollapsible) {
            return;
        }
        if (window.scrollY === 0) {
            navbarCollapsible.classList.remove('navbar-shrink')
        } else {
            navbarCollapsible.classList.add('navbar-shrink')
        }

    };

    // Shrink the navbar 
    navbarShrink();

    // Shrink the navbar when page is scrolled
    document.addEventListener('scroll', navbarShrink);

    // Activate Bootstrap scrollspy on the main nav element
    const mainNav = document.body.querySelector('#mainNav');
    if (mainNav) {
        new bootstrap.ScrollSpy(document.body, {
            target: '#mainNav',
            rootMargin: '0px 0px -40%',
        });
    };

    // Collapse responsive navbar when toggler is visible
    const navbarToggler = document.body.querySelector('.navbar-toggler');
    const responsiveNavItems = [].slice.call(
        document.querySelectorAll('#navbarResponsive .nav-link')
    );
    responsiveNavItems.map(function (responsiveNavItem) {
        responsiveNavItem.addEventListener('click', () => {
            if (window.getComputedStyle(navbarToggler).display !== 'none') {
                navbarToggler.click();
            }
        });
    });
    

});

let currentIndexes = [0, 0, 0, 0]; 

function moveSlide(modalId, direction) {
    const modalIndex = parseInt(modalId.replace('portfolioModal', '')) - 1;
    const slides = document.querySelector(`#${modalId} .slides`);
    const totalSlides = slides.children.length;

    currentIndexes[modalIndex] += direction;
    if (currentIndexes[modalIndex] < 0) {
        currentIndexes[modalIndex] = totalSlides - 1;
    } else if (currentIndexes[modalIndex] >= totalSlides) {
        currentIndexes[modalIndex] = 0;
    }

    const slideWidth = slides.children[0].clientWidth;
    slides.style.transform = `translateX(${-currentIndexes[modalIndex] * slideWidth}px)`;
}
