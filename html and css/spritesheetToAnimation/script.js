var animationInterval;
var spriteSheet = document.getElementById("sprite-image");
var position = 0;
const frameWidth = 256; // Width of each frame
const totalWidth = 1536; // Total width of the sprite sheet
const speed = 100; // Interval in milliseconds (10 frames per second)

function startAnimation() {
    animationInterval = setInterval(() => {
        // Shift the background position to the left by the frame width
        spriteSheet.style.backgroundPosition = `-${position}px 0px`;

        // Move to the next frame
        if (position < totalWidth - frameWidth) {
            position += frameWidth;
        } else {
            position = 0; // Reset to the first frame for a loop
        }
    }, speed);
}

function stopAnimation() {
    clearInterval(animationInterval); // Stop the animation
}

// Call startAnimation() to begin
startAnimation();
