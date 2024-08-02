
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
