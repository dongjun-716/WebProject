document.addEventListener('DOMContentLoaded', function () {
  var swiper = new Swiper('.blog-slider', {
      spaceBetween: 30,
      effect: 'fade',
      loop: true,
      pagination: {
          el: '.blog-slider__pagination',
          clickable: true,
      },
      mousewheel: {
          invert: false,
      },
      slidesPerView: 1,
      autoHeight: true,
  });
});
