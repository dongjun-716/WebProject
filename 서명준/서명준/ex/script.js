document.addEventListener("DOMContentLoaded", () => {
    const bars = document.querySelectorAll('.bar .progress-line span');
    
    const observer = new IntersectionObserver(entries => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.style.transform = 'scaleX(1)';
                entry.target.style.transition = 'transform 2s cubic-bezier(1, 0, 0.5, 1)';
            }
        });
    }, { threshold: 0.5 });

    bars.forEach(bar => {
        observer.observe(bar);
    });
});
