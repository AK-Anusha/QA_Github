const { test, expect } = require('@playwright/test');

test('Login Test', async ({ page }) => {
  await page.goto('https://example.com/login');
  await page.fill('#username', 'testuser');
  await page.fill('#password', 'password');
  await page.click('#loginBtn');
  await expect(page).toHaveTitle(/Dashboard/);
});
